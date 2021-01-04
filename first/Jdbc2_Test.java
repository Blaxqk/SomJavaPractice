package buing.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class Jdbc2_Test {
//    public static void main(String[] args) {
//        //查询“计算机系2019级1班”所有同学的成绩，要求显示班级信息，学生信息，课程信息，分数
//
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //创建数据库连接
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password = 233233&useUnicode=true&characterEncoding=UTF-8");
//
//            //创建操作命令对象
//            statement = connection.createStatement();
//            //sql语句
//            String sql = "select stu.id,stu.name,cla.name 班级,cou.name 课程,sc.score from student stu left join classes cla on stu.classes_id=cla.id" +
//                    " left join score sc on sc.student_id=stu.id " +
//                    " left join course cou on sc.course_id=cou.id " +
//                    "  where cla.name='计算机系2019级1班'";
//            resultSet = statement.executeQuery(sql);
//
//            //处理结果集
//            while (resultSet.next()){
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }  finally {
//
//        }
//    }
//}


/**
 * 课堂练习：
 * 1.查询“计算机系2019级1班”所有同学成绩，要求显示班级名称、学生信息、课程信息、分数
 * 2.在第一题的基础上， 模拟文本框输入的班级名称，查询信息
 */
public class Jdbc2_Test{
    public static void main(String[] args) {
        List<Info> infos = query("计算机系2019级1班");//将query的值存入infos，--->返回给前端
        query("中文系2019级3班");
    }
    public static List<Info> query(String inputClassName) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password = 233233&useUnicode=true&characterEncoding=UTF-8");
            //创建操作命令对象
            statement = connection.createStatement();

            String sql = "select stu.id,stu.name,cls.name 班级名称,sco.score,course.name from student stu " +
                    "left join score sco on stu.id=sco.student_id " +
                    "left join classes cls on stu.classes_id=cls.id " +
                    " left join course on sco.course_id = course.id " +
                    "where cls.name='"+inputClassName+"'";
            resultSet =  statement.executeQuery(sql);


            List<Info> infoList = new ArrayList<>();
            while(resultSet.next()){
                int stu_id = resultSet.getInt("stu.id");
                String name = resultSet.getString("stu.name");
                String className = resultSet.getString("班级名称");
                BigDecimal score =  resultSet.getBigDecimal("sco.score");
                String courseName = resultSet.getString("course.name");

                Info info = new Info();
                info.setStu_id(stu_id);
                info.setName(name);
                info.setClassName(className);
                info.setSumScore(score);
                info.setCourseName(courseName);

                infoList.add(info);

            }
            System.out.println(infoList);
            return infoList;
        } catch (Exception e) {
            e.printStackTrace();
            //这里返回null是最不好的处理方式
            //推荐做法：再抛出异常
            throw new RuntimeException("查询班级信息出错了",e);
        }  finally {
            try {
                if(resultSet!=null) resultSet.close();
                if(statement!=null) statement.close();
                if(connection!=null) connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }


    //内部类--将每行每列的数据都包装在对象里
    private static  class Info{
        private Integer stu_id;
        private String name;
        private String className;
        private BigDecimal sumScore;
        private String courseName;

        @Override
        public String toString() {
            return "Info{" +
                    "stu_id=" + stu_id +
                    ", name='" + name + '\'' +
                    ", className='" + className + '\'' +
                    ", sumScore=" + sumScore +
                    ", courseName='" + courseName + '\'' +
                    '}';
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public Integer getStu_id() {
            return stu_id;
        }

        public void setStu_id(Integer stu_id) {
            this.stu_id = stu_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public BigDecimal getSumScore() {
            return sumScore;
        }

        public void setSumScore(BigDecimal sumScore) {
            this.sumScore = sumScore;
        }
    }
}