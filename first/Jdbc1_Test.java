package buing.jdbc.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc1_Test {
    public static void main(String[] args)  {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //一、
            // 加载JDBC驱动程序：反射，这样调用初始化com.mysql.jdbc.Driver类，
            // 即将该类加载到JVM方法区，并执行该类的静态方法块、静态属性。
            Class.forName("com.mysql.jdbc.Driver");

            // 创建数据库连接
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password = 233233&useUnicode=true&characterEncoding=UTF-8");
            System.out.println(connection);//如果打印成功，————>说明连接成功

            //二、
            //创建操作命令对象
             statement = connection.createStatement();

            //第三步：执行SQL
            String sql = "select id,name,qq_mail,classes_id from student";
             resultSet = statement.executeQuery(sql);

            List<Student> studentList = new ArrayList<>();//存储结果集

            //第四步：处理结果集（针对 “ 查询处理 ”）
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String qq_mail = resultSet.getString("qq_mail");
                int classes_id = resultSet.getInt("classes_id");

                System.out.printf("id=%s,name=%s,qq_mail=%s,classes_id=%s%n",
                        id,name,qq_mail,classes_id);

                //面向对象，封装一个类
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setQq_mail(qq_mail);
                student.setClasses_id(classes_id);

                studentList.add(student);
            }
            System.out.println("==================================================");

            System.out.println(studentList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //第五步：无论如何，都需要释放资源
            try {
                if(resultSet != null){
                    resultSet.close();
                }
                if(statement != null){
                    statement.close();
                }
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }


    }


    //内部类---> 将每行每列的数据都包装在对象里

    /**
     * 一般来说，对象中属性不提供对外直接修改
     * 1. Getter/Setter方法
     * 2. 构造方法来设置
     */
    private static class Student{
        private Integer id;
        private String name;
        private String qq_mail;
        private Integer classes_id;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", qq_mail='" + qq_mail + '\'' +
                    ", classes_id=" + classes_id +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getQq_mail() {
            return qq_mail;
        }

        public void setQq_mail(String qq_mail) {
            this.qq_mail = qq_mail;
        }

        public Integer getClasses_id() {
            return classes_id;
        }

        public void setClasses_id(Integer classes_id) {
            this.classes_id = classes_id;
        }
    }

}

/**
 * 看第二遍时练习的代码
 */

class FuxiTest{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tets?user=root&password=233233&useUnicode=true&characterEncoding=UTF-8");
        System.out.println(connection);
        //3.创建操作命令对象
        Statement statement = connection.createStatement();
        //4。执行 SQL语句
        String sql="select id,sn,name,qq_mail,classes_id from student";
        ResultSet resultSet=statement.executeQuery(sql);
        //5.处理结果集
        while(resultSet.next()){
            int id = resultSet.getInt("id");

        }
    }
}
