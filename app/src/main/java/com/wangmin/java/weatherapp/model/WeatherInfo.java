package com.wangmin.java.weatherapp.model;

import java.util.List;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 16:28
 * 修改人：王珉
 * 修改时间：2019-06-19 16:28
 * 修改备注：
 */
public class WeatherInfo {
    
    
    /**
     * reason : 查询成功!
     * result : {"data":{"realtime":{"city_code":"101010100","city_name":"北京","date":"2019-06-19","time":"17:00:00","week":"3","moon":"五月十七","dataUptime":1560936662,"weather":{"temperature":"29","humidity":"56","info":"阴","img":"02"},"wind":{"direct":"西南风","power":"2级","offset":"","windspeed":""}},"life":{"date":"2019-06-19","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"guomin":["不易发","天气条件不易诱发过敏，可放心外出，除特殊体质外，无需担心过敏问题。"],"shushidu":["较不舒适","白天天气多云，同时会感到有些热，不很舒适。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"diaoyu":["不宜","天气太热，不适合垂钓。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["适宜","天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。"],"daisan":["不带伞","天气较好，不会降水，因此您可放心出门，无须带雨伞。"]}},"weather":[{"date":"2019-06-19","info":{"dawn":["1","多云","22","东风","微风","19:45"],"day":["1","多云","31","南风","微风","04:45"],"night":["1","多云","22","东南风","微风","19:45"]},"week":"三","nongli":"五月十七"},{"date":"2019-06-20","info":{"dawn":["1","多云","22","东南风","微风","19:45"],"day":["0","晴","35","南风","微风","04:46"],"night":["0","晴","23","东风","微风","19:46"]},"week":"四","nongli":"五月十八"},{"date":"2019-06-21","info":{"dawn":["0","晴","23","东风","微风","19:46"],"day":["1","多云","32","东南风","3-5级","04:46"],"night":["1","多云","21","东南风","微风","19:46"]},"week":"五","nongli":"五月十九"},{"date":"2019-06-22","info":{"dawn":["1","多云","21","东南风","微风","19:46"],"day":["0","晴","33","西南风","微风","04:46"],"night":["0","晴","21","西南风","微风","19:46"]},"week":"六","nongli":"五月二十"},{"date":"2019-06-23","info":{"dawn":["0","晴","21","西南风","微风","19:46"],"day":["0","晴","34","西南风","微风","04:46"],"night":["1","多云","23","西南风","微风","19:46"]},"week":"日","nongli":"五月廿一"}],"f3h":{"temperature":[{"jg":"20190619170000","jb":"29"},{"jg":"20190619200000","jb":"27"},{"jg":"20190619230000","jb":"25"},{"jg":"20190620020000","jb":"23"},{"jg":"20190620050000","jb":"22"},{"jg":"20190620080000","jb":"26"},{"jg":"20190620110000","jb":"30"},{"jg":"20190620140000","jb":"33"},{"jg":"20190620170000","jb":"33"}],"precipitation":[{"jg":"20190619170000","jf":"0"},{"jg":"20190619200000","jf":"0"},{"jg":"20190619230000","jf":"0"},{"jg":"20190620020000","jf":"0"},{"jg":"20190620050000","jf":"0"},{"jg":"20190620080000","jf":"0"},{"jg":"20190620110000","jf":"0"},{"jg":"20190620140000","jf":"0"},{"jg":"20190620170000","jf":"0"}]},"pm25":{"pm25":{"level":3,"quality":"轻度污染","des":"空气一般，敏感人员外出时，需做好防护措施。","curPm":"114","pm25":"58","pm10":"81","pub_time":1560931200,"city_code":"101010100"},"cityName":"北京","key":"北京","dateTime":"2019年06月19日16时"},"jingqu":"","jingqutq":"","date":"","isForeign":"0","partner":{"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101010100&q=&ts=1560937935&t=99287b248d78c3d13063caecfb2aefd"}}}
     * error_code : 0
     */
    
    private String reason;
    private ResultBean result;
    private int error_code;
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public ResultBean getResult() {
        return result;
    }
    
    public void setResult(ResultBean result) {
        this.result = result;
    }
    
    public int getError_code() {
        return error_code;
    }
    
    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
    
    public static class ResultBean {
        /**
         * data : {"realtime":{"city_code":"101010100","city_name":"北京","date":"2019-06-19","time":"17:00:00","week":"3","moon":"五月十七","dataUptime":1560936662,"weather":{"temperature":"29","humidity":"56","info":"阴","img":"02"},"wind":{"direct":"西南风","power":"2级","offset":"","windspeed":""}},"life":{"date":"2019-06-19","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"guomin":["不易发","天气条件不易诱发过敏，可放心外出，除特殊体质外，无需担心过敏问题。"],"shushidu":["较不舒适","白天天气多云，同时会感到有些热，不很舒适。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"diaoyu":["不宜","天气太热，不适合垂钓。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["适宜","天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。"],"daisan":["不带伞","天气较好，不会降水，因此您可放心出门，无须带雨伞。"]}},"weather":[{"date":"2019-06-19","info":{"dawn":["1","多云","22","东风","微风","19:45"],"day":["1","多云","31","南风","微风","04:45"],"night":["1","多云","22","东南风","微风","19:45"]},"week":"三","nongli":"五月十七"},{"date":"2019-06-20","info":{"dawn":["1","多云","22","东南风","微风","19:45"],"day":["0","晴","35","南风","微风","04:46"],"night":["0","晴","23","东风","微风","19:46"]},"week":"四","nongli":"五月十八"},{"date":"2019-06-21","info":{"dawn":["0","晴","23","东风","微风","19:46"],"day":["1","多云","32","东南风","3-5级","04:46"],"night":["1","多云","21","东南风","微风","19:46"]},"week":"五","nongli":"五月十九"},{"date":"2019-06-22","info":{"dawn":["1","多云","21","东南风","微风","19:46"],"day":["0","晴","33","西南风","微风","04:46"],"night":["0","晴","21","西南风","微风","19:46"]},"week":"六","nongli":"五月二十"},{"date":"2019-06-23","info":{"dawn":["0","晴","21","西南风","微风","19:46"],"day":["0","晴","34","西南风","微风","04:46"],"night":["1","多云","23","西南风","微风","19:46"]},"week":"日","nongli":"五月廿一"}],"f3h":{"temperature":[{"jg":"20190619170000","jb":"29"},{"jg":"20190619200000","jb":"27"},{"jg":"20190619230000","jb":"25"},{"jg":"20190620020000","jb":"23"},{"jg":"20190620050000","jb":"22"},{"jg":"20190620080000","jb":"26"},{"jg":"20190620110000","jb":"30"},{"jg":"20190620140000","jb":"33"},{"jg":"20190620170000","jb":"33"}],"precipitation":[{"jg":"20190619170000","jf":"0"},{"jg":"20190619200000","jf":"0"},{"jg":"20190619230000","jf":"0"},{"jg":"20190620020000","jf":"0"},{"jg":"20190620050000","jf":"0"},{"jg":"20190620080000","jf":"0"},{"jg":"20190620110000","jf":"0"},{"jg":"20190620140000","jf":"0"},{"jg":"20190620170000","jf":"0"}]},"pm25":{"pm25":{"level":3,"quality":"轻度污染","des":"空气一般，敏感人员外出时，需做好防护措施。","curPm":"114","pm25":"58","pm10":"81","pub_time":1560931200,"city_code":"101010100"},"cityName":"北京","key":"北京","dateTime":"2019年06月19日16时"},"jingqu":"","jingqutq":"","date":"","isForeign":"0","partner":{"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101010100&q=&ts=1560937935&t=99287b248d78c3d13063caecfb2aefd"}}
         */
        
        private DataBean data;
        
        public DataBean getData() {
            return data;
        }
        
        public void setData(DataBean data) {
            this.data = data;
        }
        
        public static class DataBean {
            /**
             * realtime : {"city_code":"101010100","city_name":"北京","date":"2019-06-19","time":"17:00:00","week":"3","moon":"五月十七","dataUptime":1560936662,"weather":{"temperature":"29","humidity":"56","info":"阴","img":"02"},"wind":{"direct":"西南风","power":"2级","offset":"","windspeed":""}}
             * life : {"date":"2019-06-19","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"guomin":["不易发","天气条件不易诱发过敏，可放心外出，除特殊体质外，无需担心过敏问题。"],"shushidu":["较不舒适","白天天气多云，同时会感到有些热，不很舒适。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"diaoyu":["不宜","天气太热，不适合垂钓。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["适宜","天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。"],"daisan":["不带伞","天气较好，不会降水，因此您可放心出门，无须带雨伞。"]}}
             * weather : [{"date":"2019-06-19","info":{"dawn":["1","多云","22","东风","微风","19:45"],"day":["1","多云","31","南风","微风","04:45"],"night":["1","多云","22","东南风","微风","19:45"]},"week":"三","nongli":"五月十七"},{"date":"2019-06-20","info":{"dawn":["1","多云","22","东南风","微风","19:45"],"day":["0","晴","35","南风","微风","04:46"],"night":["0","晴","23","东风","微风","19:46"]},"week":"四","nongli":"五月十八"},{"date":"2019-06-21","info":{"dawn":["0","晴","23","东风","微风","19:46"],"day":["1","多云","32","东南风","3-5级","04:46"],"night":["1","多云","21","东南风","微风","19:46"]},"week":"五","nongli":"五月十九"},{"date":"2019-06-22","info":{"dawn":["1","多云","21","东南风","微风","19:46"],"day":["0","晴","33","西南风","微风","04:46"],"night":["0","晴","21","西南风","微风","19:46"]},"week":"六","nongli":"五月二十"},{"date":"2019-06-23","info":{"dawn":["0","晴","21","西南风","微风","19:46"],"day":["0","晴","34","西南风","微风","04:46"],"night":["1","多云","23","西南风","微风","19:46"]},"week":"日","nongli":"五月廿一"}]
             * f3h : {"temperature":[{"jg":"20190619170000","jb":"29"},{"jg":"20190619200000","jb":"27"},{"jg":"20190619230000","jb":"25"},{"jg":"20190620020000","jb":"23"},{"jg":"20190620050000","jb":"22"},{"jg":"20190620080000","jb":"26"},{"jg":"20190620110000","jb":"30"},{"jg":"20190620140000","jb":"33"},{"jg":"20190620170000","jb":"33"}],"precipitation":[{"jg":"20190619170000","jf":"0"},{"jg":"20190619200000","jf":"0"},{"jg":"20190619230000","jf":"0"},{"jg":"20190620020000","jf":"0"},{"jg":"20190620050000","jf":"0"},{"jg":"20190620080000","jf":"0"},{"jg":"20190620110000","jf":"0"},{"jg":"20190620140000","jf":"0"},{"jg":"20190620170000","jf":"0"}]}
             * pm25 : {"pm25":{"level":3,"quality":"轻度污染","des":"空气一般，敏感人员外出时，需做好防护措施。","curPm":"114","pm25":"58","pm10":"81","pub_time":1560931200,"city_code":"101010100"},"cityName":"北京","key":"北京","dateTime":"2019年06月19日16时"}
             * jingqu :
             * jingqutq :
             * date :
             * isForeign : 0
             * partner : {"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101010100&q=&ts=1560937935&t=99287b248d78c3d13063caecfb2aefd"}
             */
            
            private RealtimeBean realtime;
            private LifeBean life;
            private F3hBean f3h;
            private Pm25BeanX pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            private PartnerBean partner;
            private List<WeatherBeanX> weather;
            
            public RealtimeBean getRealtime() {
                return realtime;
            }
            
            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }
            
            public LifeBean getLife() {
                return life;
            }
            
            public void setLife(LifeBean life) {
                this.life = life;
            }
            
            public F3hBean getF3h() {
                return f3h;
            }
            
            public void setF3h(F3hBean f3h) {
                this.f3h = f3h;
            }
            
            public Pm25BeanX getPm25() {
                return pm25;
            }
            
            public void setPm25(Pm25BeanX pm25) {
                this.pm25 = pm25;
            }
            
            public String getJingqu() {
                return jingqu;
            }
            
            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }
            
            public String getJingqutq() {
                return jingqutq;
            }
            
            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }
            
            public String getDate() {
                return date;
            }
            
            public void setDate(String date) {
                this.date = date;
            }
            
            public String getIsForeign() {
                return isForeign;
            }
            
            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }
            
            public PartnerBean getPartner() {
                return partner;
            }
            
            public void setPartner(PartnerBean partner) {
                this.partner = partner;
            }
            
            public List<WeatherBeanX> getWeather() {
                return weather;
            }
            
            public void setWeather(List<WeatherBeanX> weather) {
                this.weather = weather;
            }
            
            public static class RealtimeBean {
                /**
                 * city_code : 101010100
                 * city_name : 北京
                 * date : 2019-06-19
                 * time : 17:00:00
                 * week : 3
                 * moon : 五月十七
                 * dataUptime : 1560936662
                 * weather : {"temperature":"29","humidity":"56","info":"阴","img":"02"}
                 * wind : {"direct":"西南风","power":"2级","offset":"","windspeed":""}
                 */
                
                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private String week;
                private String moon;
                private int dataUptime;
                private WeatherBean weather;
                private WindBean wind;
                
                public String getCity_code() {
                    return city_code;
                }
                
                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
                
                public String getCity_name() {
                    return city_name;
                }
                
                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }
                
                public String getDate() {
                    return date;
                }
                
                public void setDate(String date) {
                    this.date = date;
                }
                
                public String getTime() {
                    return time;
                }
                
                public void setTime(String time) {
                    this.time = time;
                }
                
                public String getWeek() {
                    return week;
                }
                
                public void setWeek(String week) {
                    this.week = week;
                }
                
                public String getMoon() {
                    return moon;
                }
                
                public void setMoon(String moon) {
                    this.moon = moon;
                }
                
                public int getDataUptime() {
                    return dataUptime;
                }
                
                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }
                
                public WeatherBean getWeather() {
                    return weather;
                }
                
                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }
                
                public WindBean getWind() {
                    return wind;
                }
                
                public void setWind(WindBean wind) {
                    this.wind = wind;
                }
                
                public static class WeatherBean {
                    /**
                     * temperature : 29
                     * humidity : 56
                     * info : 阴
                     * img : 02
                     */
                    
                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;
                    
                    public String getTemperature() {
                        return temperature;
                    }
                    
                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }
                    
                    public String getHumidity() {
                        return humidity;
                    }
                    
                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }
                    
                    public String getInfo() {
                        return info;
                    }
                    
                    public void setInfo(String info) {
                        this.info = info;
                    }
                    
                    public String getImg() {
                        return img;
                    }
                    
                    public void setImg(String img) {
                        this.img = img;
                    }
                }
                
                public static class WindBean {
                    /**
                     * direct : 西南风
                     * power : 2级
                     * offset :
                     * windspeed :
                     */
                    
                    private String direct;
                    private String power;
                    private String offset;
                    private String windspeed;
                    
                    public String getDirect() {
                        return direct;
                    }
                    
                    public void setDirect(String direct) {
                        this.direct = direct;
                    }
                    
                    public String getPower() {
                        return power;
                    }
                    
                    public void setPower(String power) {
                        this.power = power;
                    }
                    
                    public String getOffset() {
                        return offset;
                    }
                    
                    public void setOffset(String offset) {
                        this.offset = offset;
                    }
                    
                    public String getWindspeed() {
                        return windspeed;
                    }
                    
                    public void setWindspeed(String windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }
            
            public static class LifeBean {
                /**
                 * date : 2019-06-19
                 * info : {"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"guomin":["不易发","天气条件不易诱发过敏，可放心外出，除特殊体质外，无需担心过敏问题。"],"shushidu":["较不舒适","白天天气多云，同时会感到有些热，不很舒适。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"diaoyu":["不宜","天气太热，不适合垂钓。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["适宜","天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。"],"daisan":["不带伞","天气较好，不会降水，因此您可放心出门，无须带雨伞。"]}
                 */
                
                private String date;
                private InfoBean info;
                
                public String getDate() {
                    return date;
                }
                
                public void setDate(String date) {
                    this.date = date;
                }
                
                public InfoBean getInfo() {
                    return info;
                }
                
                public void setInfo(InfoBean info) {
                    this.info = info;
                }
                
                public static class InfoBean {
                    private List<String> kongtiao;
                    private List<String> guomin;
                    private List<String> shushidu;
                    private List<String> chuanyi;
                    private List<String> diaoyu;
                    private List<String> ganmao;
                    private List<String> ziwaixian;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> daisan;
                    
                    public List<String> getKongtiao() {
                        return kongtiao;
                    }
                    
                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }
                    
                    public List<String> getGuomin() {
                        return guomin;
                    }
                    
                    public void setGuomin(List<String> guomin) {
                        this.guomin = guomin;
                    }
                    
                    public List<String> getShushidu() {
                        return shushidu;
                    }
                    
                    public void setShushidu(List<String> shushidu) {
                        this.shushidu = shushidu;
                    }
                    
                    public List<String> getChuanyi() {
                        return chuanyi;
                    }
                    
                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }
                    
                    public List<String> getDiaoyu() {
                        return diaoyu;
                    }
                    
                    public void setDiaoyu(List<String> diaoyu) {
                        this.diaoyu = diaoyu;
                    }
                    
                    public List<String> getGanmao() {
                        return ganmao;
                    }
                    
                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }
                    
                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }
                    
                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                    
                    public List<String> getXiche() {
                        return xiche;
                    }
                    
                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }
                    
                    public List<String> getYundong() {
                        return yundong;
                    }
                    
                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }
                    
                    public List<String> getDaisan() {
                        return daisan;
                    }
                    
                    public void setDaisan(List<String> daisan) {
                        this.daisan = daisan;
                    }
                }
            }
            
            public static class F3hBean {
                private List<TemperatureBean> temperature;
                private List<PrecipitationBean> precipitation;
                
                public List<TemperatureBean> getTemperature() {
                    return temperature;
                }
                
                public void setTemperature(List<TemperatureBean> temperature) {
                    this.temperature = temperature;
                }
                
                public List<PrecipitationBean> getPrecipitation() {
                    return precipitation;
                }
                
                public void setPrecipitation(List<PrecipitationBean> precipitation) {
                    this.precipitation = precipitation;
                }
                
                public static class TemperatureBean {
                    /**
                     * jg : 20190619170000
                     * jb : 29
                     */
                    
                    private String jg;
                    private String jb;
                    
                    public String getJg() {
                        return jg;
                    }
                    
                    public void setJg(String jg) {
                        this.jg = jg;
                    }
                    
                    public String getJb() {
                        return jb;
                    }
                    
                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }
                
                public static class PrecipitationBean {
                    /**
                     * jg : 20190619170000
                     * jf : 0
                     */
                    
                    private String jg;
                    private String jf;
                    
                    public String getJg() {
                        return jg;
                    }
                    
                    public void setJg(String jg) {
                        this.jg = jg;
                    }
                    
                    public String getJf() {
                        return jf;
                    }
                    
                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }
            
            public static class Pm25BeanX {
                /**
                 * pm25 : {"level":3,"quality":"轻度污染","des":"空气一般，敏感人员外出时，需做好防护措施。","curPm":"114","pm25":"58","pm10":"81","pub_time":1560931200,"city_code":"101010100"}
                 * cityName : 北京
                 * key : 北京
                 * dateTime : 2019年06月19日16时
                 */
                
                private Pm25Bean pm25;
                private String cityName;
                private String key;
                private String dateTime;
                
                public Pm25Bean getPm25() {
                    return pm25;
                }
                
                public void setPm25(Pm25Bean pm25) {
                    this.pm25 = pm25;
                }
                
                public String getCityName() {
                    return cityName;
                }
                
                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }
                
                public String getKey() {
                    return key;
                }
                
                public void setKey(String key) {
                    this.key = key;
                }
                
                public String getDateTime() {
                    return dateTime;
                }
                
                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }
                
                public static class Pm25Bean {
                    /**
                     * level : 3
                     * quality : 轻度污染
                     * des : 空气一般，敏感人员外出时，需做好防护措施。
                     * curPm : 114
                     * pm25 : 58
                     * pm10 : 81
                     * pub_time : 1560931200
                     * city_code : 101010100
                     */
                    
                    private int level;
                    private String quality;
                    private String des;
                    private String curPm;
                    private String pm25;
                    private String pm10;
                    private int pub_time;
                    private String city_code;
                    
                    public int getLevel() {
                        return level;
                    }
                    
                    public void setLevel(int level) {
                        this.level = level;
                    }
                    
                    public String getQuality() {
                        return quality;
                    }
                    
                    public void setQuality(String quality) {
                        this.quality = quality;
                    }
                    
                    public String getDes() {
                        return des;
                    }
                    
                    public void setDes(String des) {
                        this.des = des;
                    }
                    
                    public String getCurPm() {
                        return curPm;
                    }
                    
                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }
                    
                    public String getPm25() {
                        return pm25;
                    }
                    
                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }
                    
                    public String getPm10() {
                        return pm10;
                    }
                    
                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }
                    
                    public int getPub_time() {
                        return pub_time;
                    }
                    
                    public void setPub_time(int pub_time) {
                        this.pub_time = pub_time;
                    }
                    
                    public String getCity_code() {
                        return city_code;
                    }
                    
                    public void setCity_code(String city_code) {
                        this.city_code = city_code;
                    }
                }
            }
            
            public static class PartnerBean {
                /**
                 * title_word : 全国
                 * show_url : tianqi.so.com
                 * base_url : http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101010100&q=&ts=1560937935&t=99287b248d78c3d13063caecfb2aefd
                 */
                
                private String title_word;
                private String show_url;
                private String base_url;
                
                public String getTitle_word() {
                    return title_word;
                }
                
                public void setTitle_word(String title_word) {
                    this.title_word = title_word;
                }
                
                public String getShow_url() {
                    return show_url;
                }
                
                public void setShow_url(String show_url) {
                    this.show_url = show_url;
                }
                
                public String getBase_url() {
                    return base_url;
                }
                
                public void setBase_url(String base_url) {
                    this.base_url = base_url;
                }
            }
            
            public static class WeatherBeanX {
                /**
                 * date : 2019-06-19
                 * info : {"dawn":["1","多云","22","东风","微风","19:45"],"day":["1","多云","31","南风","微风","04:45"],"night":["1","多云","22","东南风","微风","19:45"]}
                 * week : 三
                 * nongli : 五月十七
                 */
                
                private String date;
                private InfoBeanX info;
                private String week;
                private String nongli;
                
                public String getDate() {
                    return date;
                }
                
                public void setDate(String date) {
                    this.date = date;
                }
                
                public InfoBeanX getInfo() {
                    return info;
                }
                
                public void setInfo(InfoBeanX info) {
                    this.info = info;
                }
                
                public String getWeek() {
                    return week;
                }
                
                public void setWeek(String week) {
                    this.week = week;
                }
                
                public String getNongli() {
                    return nongli;
                }
                
                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }
                
                public static class InfoBeanX {
                    private List<String> dawn;
                    private List<String> day;
                    private List<String> night;
                    
                    public List<String> getDawn() {
                        return dawn;
                    }
                    
                    public void setDawn(List<String> dawn) {
                        this.dawn = dawn;
                    }
                    
                    public List<String> getDay() {
                        return day;
                    }
                    
                    public void setDay(List<String> day) {
                        this.day = day;
                    }
                    
                    public List<String> getNight() {
                        return night;
                    }
                    
                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}

