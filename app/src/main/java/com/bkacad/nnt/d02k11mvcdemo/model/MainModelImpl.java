package com.bkacad.nnt.d02k11mvcdemo.model;

import com.bkacad.nnt.d02k11mvcdemo.utils.MyUtils;

public class MainModelImpl implements MainModel{

    @Override
    public String handleGetData() throws Exception {
        // Tạm thời random thành công hoặc thất bại
        // random từ 1 -> 100 (nếu chẵn -> gửi thành công), lẻ thất bại
        int rs = MyUtils.getRandomNumber(1, 100) % 2;
        if( rs == 0){
            return "Thành công";
        }
        else{
            throw new Exception("Thất bại - địa chỉ không đúng");
        }
    }
}
