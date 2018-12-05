/**
 * 
 */
package com.meisoft.tran.utils;

import com.solidfire.gson.Gson;
import com.solidfire.gson.reflect.TypeToken;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class GsonUtils {
	     public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
	         Gson gson = new Gson();
	         T result = gson.fromJson(jsonData, type);
	        return result;
	     }
	
	     public static <T> List<T> parseJsonArrayWithGson(String jsonData,
	             Class<T> type) {
	        Gson gson = new Gson();
	         List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {
	        }.getType());
	         return result;
	    }
}
