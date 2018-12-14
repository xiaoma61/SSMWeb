package com.xiaoma.Util;



import com.xiaoma.entity.NEWS;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;



import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonUtil {



    public List<NEWS> getPath() throws IOException, JSONException {


        String fileName = "F:\\工具\\韦老师作业\\java\\src\\json\\getTmsContent.json";
    //    String fileName =JsonUtil.class.getClassLoader().getResource("src/json/getTmsContent.json").getPath();
        File file = new File(fileName);//这里可以把路径拼在fileName前面 可以用相对路径 也可以用绝对 注意分隔符



        List<NEWS>newsList=new ArrayList<NEWS>();


        JSONArray btnArray = new JSONArray();
        String input = FileUtils.readFileToString(file, "UTF-8");
        JSONObject jsonObject = JSONObject.fromObject(input);
        String status=jsonObject.getString("data");
        JSONObject jsonObject1 = JSONObject.fromObject(status);
        String status1=jsonObject1.getString("jsonString");
        JSONObject jsonObject2 = JSONObject.fromObject( status1);
        String announcement=jsonObject2.getString("announcement");

//        JSONObject jsonObject1=JSONObject.fromObject(status);
        JSONArray data = jsonObject2.getJSONArray("announcement");
        for(int i=0;i<data.size();i++){

            JSONObject jObject3=data.getJSONObject(i);

            System.out.println("url: "+jObject3.getString("url"));
            NEWS news=new NEWS();
            news.setTITLE(jObject3.getString("title"));
            news.setURL(jObject3.getString("url"));
            newsList.add(news);


        }



        return newsList;


    }

//    public static void main(String[] args)
//    {
//        try {
//            JsonUtil jsonUtil=new JsonUtil();
//            jsonUtil.getPath();
//
////            getPath();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }


}
