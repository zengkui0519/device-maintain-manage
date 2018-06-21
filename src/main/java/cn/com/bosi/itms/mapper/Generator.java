package cn.com.bosi.itms.mapper;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

public class Generator {
    public static void main(String[] args) throws Exception{
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.0.240:1521:orcl";
        String userName = "odin_itms_new";
        String password = "odin_itms_new";
        SQLManager sqlManager = new SQLManager(
                new MySqlStyle(),
                new ClasspathLoader("/sql"),
                ConnectionSourceHelper.getSimple(driver, url, userName, password),
                new UnderlinedNameConversion(),
                new Interceptor[]{new DebugInterceptor()});

        sqlManager.genPojoCodeToConsole("TEST");
        sqlManager.genSQLTemplateToConsole("TEST");
    }
}
