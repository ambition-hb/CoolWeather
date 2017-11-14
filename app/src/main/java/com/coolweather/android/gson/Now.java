package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 浩比 on 2017/11/11.
 */

public class Now {

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;//天气信息

    }

    public String fl;//体感温度

    public String hum;//相对湿度

    public String pcpn;//降水量

    public String pres;//大气压强

    @SerializedName("tmp")
    public String temperature;//温度

    public String vis;//能见度

    public WIND wind;

    public class WIND{

        public String dir;//风向

        public String sc;//风力

        public String spd;//风速

    }
}
