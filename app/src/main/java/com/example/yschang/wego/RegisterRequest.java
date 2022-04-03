package com.example.yschang.wego;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    // 서버 Url 설정 (PHP 파일 연동)
    final  static private String URL = "http://quddnr5571.dothome.co.kr/Register.php"; // 요거 땜에 2시간 날림;
    private Map<String, String> map;


    public RegisterRequest(String userID, String userPassword, String userName, int userAge, Response.Listener<String> listener ){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("userAge",userAge + "");
    }


    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }

}
