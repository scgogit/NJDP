package com.njdp.njdp_farmer.bean;

/**
 * Created by USER-PC on 2016/4/13.
 */
public class Farmer {
    private String name;
    private String telephone;
    private String password;
    private String imageUrl;
    private boolean isLogined;

    public  String getName()
    {
        return name;
    }

    public  void setName(String name)
    {
        this.name=name;
    }

    public  String getTelephone()
    {
        return telephone;
    }

    public  void setTelephone(String telephone)
    {
        this.telephone=telephone;
    }

    public  String getImageUrl()
    {
        return imageUrl;
    }

    public  void setImageUrl(String imageUrl)
    {
        this.imageUrl=imageUrl;
    }

    public  String getPassword()
    {
        return password;
    }

    public  void setPassword(String password)
    {
        this.password=password;
    }

    public boolean getIsLogined()
    {
        return isLogined;
    }

    public void setIsLogined(boolean isLogined)
    {
        this.isLogined=isLogined;
    }
}
