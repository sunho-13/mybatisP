//package org.example.mybastisp;
//
//import lombok.RequiredArgsConstructor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(basePackages = "com.softagape.mybatisprj")   // mapper �������̽��� ��ο� �����ؾ� �Ѵ�.
//@RequiredArgsConstructor
//public class MyBatisConfig {
//
//    private final ApplicationContext applicationContext;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory (DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.softagape.mybatisprj");
//        sqlSessionFactoryBean.setMapperLocations(
//                applicationContext.getResources("classpath:/mymapper/**/*.xml"
//                ));
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSession (SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
