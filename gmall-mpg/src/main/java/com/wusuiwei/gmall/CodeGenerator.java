package com.wusuiwei.gmall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {
    public static void main(String[] args) {

        String moduleName = "pms";
        // 1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2.全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\code\\github\\gmall\\gmall-mpg\\src\\main\\java");
        gc.setAuthor("wusuiwei");
        gc.setFileOverride(true);//重新生成时覆盖原文件
        gc.setSwagger2(true);//开启swagger2模式
        gc.setIdType(IdType.AUTO);//主键生成策略
        gc.setServiceName("%Service");//去掉Service接口的首字母I
        mpg.setGlobalConfig(gc);

        // 3.数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://192.168.159.128:3306/gmall_" + moduleName + "?useUnicode=true&SSL=false&charcterEncodeing=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 4.包设置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);
        pc.setParent("com.wusuiwei.gmall");
        pc.setController("controller");
        pc.setService("service");
        pc.setMapper("mapper");
        pc.setEntity("entity");
        mpg.setPackageInfo(pc);

        // 5.生成策略设置
        StrategyConfig sc = new StrategyConfig();
        sc.setLikeTable(new LikeTable(moduleName+"_"));//设置要映射的表名
        sc.setTablePrefix(moduleName + "_");//设置表前缀不生成
        //sc.setEntityTableFieldAnnotationEnable(true);//是否生成实体时，生成字段注解
        sc.setNaming(NamingStrategy.underline_to_camel);//指定实体命名策略
        sc.setColumnNaming(NamingStrategy.underline_to_camel);//指定字段命名策略
        sc.setEntityLombokModel(true);//开启Lombok模型 @Accessars(chain=true) setter链式操作
        sc.setRestControllerStyle(true);//restful api 风格控制器
        mpg.setStrategy(sc);

        // 6.执行代码生成器
        mpg.execute();


    }
}
