package com.njdp.njdp_farmer.db;

/**
 * Created by USER-PC on 2016/4/13.
 */
public class AppConfig {
    //服务器地址
    public static String URL_IP="http://192.168.1.110:8080/";

    // 登录 url
    public static String URL_LOGIN = URL_IP+"db_xskq/login1.php";

    // 注册 url
    public static String URL_REGISTER = URL_IP+"db_xskq/register1.php";

    // 找回密码 url
    public static String URL_GETPASSWORD1= URL_IP+"db_xskq/forget_password_isAccess.php";

    public static String URL_GETPASSWORD2= URL_IP+"db_xskq/forget_password_finish.php";
}
