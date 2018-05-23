package gradle;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.Maps;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class TestGson {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		Type listType = new TypeToken<List<String>>() {}.getType();
		List<String> target = new LinkedList<String>();
		target.add("blah");
		
		Gson gson = new Gson();
		String json = gson.toJson(target, listType);
		System.out.println(json);
		List<String> list = gson.fromJson(json, listType);
		System.out.println(list.get(0));
		
		HashMap<String, String> hashMap = Maps.newHashMap();
		hashMap.put("user", "李雷");
		
		String json1 = gson.toJson(hashMap);
		System.out.println(json1);
	}
}
