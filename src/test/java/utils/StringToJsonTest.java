package utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class StringToJsonTest {

	static String jsonStr = "[{\"id\":2,\"GXCode\":\"GX002\",\"Cvalue\":\"壳内、面、针尖毛\",\"CretTime\":\"Date(1515575301430)\",\"CretBy\":null,\"gxCodes\":null},{\"id\":3,\"GXCode\":\"GX002\",\"Cvalue\":\"按任何两只按的表针不动\",\"CretTime\":\"Date(1515575306357)\",\"CretBy\":null,\"gxCodes\":null},{\"id\":7,\"GXCode\":\"GX002\",\"Cvalue\":\"壳、圈、的花崩\",\"CretTime\":\"Date(1515660639733)\",\"CretBy\":\"2018001\",\"gxCodes\":null},{\"id\":18,\"GXCode\":\"GX002\",\"Cvalue\":\"上底盖位不对点\",\"CretTime\":\"Date(1515675012130)\",\"CretBy\":\"2018001\",\"gxCodes\":null},{\"id\":19,\"GXCode\":\"GX002\",\"Cvalue\":\"底盖花崩\",\"CretTime\":\"Date(1515675046897)\",\"CretBy\":\"2018001\",\"gxCodes\":null}]";
	
	public static void main(String[] args) {
		JSONArray jsonArray = JSONArray.parseArray(jsonStr);
		System.out.println(jsonArray.size());
		if(jsonArray.size() > 0) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				System.out.println(jsonObject.get("Cvalue"));
			}
		}
	}
}
