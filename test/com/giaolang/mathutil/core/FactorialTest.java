/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;


import org.junit.Assert;
import org.junit.Test;  //JUnit 4

/**
 *
 * @author giao.lang
 */
public class FactorialTest {
    
    @Test  //biến 1 hàm đi kèm cái Annotation này thành hàm main()
    public void checkFactorialGivenRightArgumentReturnsWell() {
        long expected = 120; //tui kì vọng 120 trả về
        long actual = MathUtil.getFactorial(5); //nếu tui tính 5!
        
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
    
    //bắt xem, test xem hàm có ném về ngoại lệ như kì vọng hay ko
    //ví dụ nếu ta tính getF(-5) -> thề, ném ra ngoại lệ
    //nếu đúng gọi hàm getF(-5) mà hàm ném ra ngoại lệ tương ứng -> hàm viết
    //đúng, ta có màu xanh. 
    //hàm đc thiết kế đưa âm ném ngoại lệ, thực sự khi chạy nó ném ra thật
    //có nghĩa hàm đúng, như kì vọng, thì màu xanh, 
    //JUnit 4 coi ngoại lệ ko là giá trị, ko assertEquals(ngoại lệ, actual)
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-25); //phải ném ngoại lệ mới là đúng
    }
    
}

//CHỐT HẠ CHO XANH ĐỎ
//* XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST PHẢI LÀ MÀU XANH, TỨC LÀ MỌI EXPECTED
//VÀ ACTUAL PHẢI KHỚP NHAU

//* ĐỎ: CHỈ CẦN 1 CÁI ĐỎ, TẤT CẢ COI NHƯ ĐỎ

//LOGIC: HÀM ĐÃ ĐÚNG THÌ PHẢI ĐÚNG CHO MỌI TÌNH HUỐNG TEST 
//       KO CHẤP NHẬN LÚC ĐÚNG LÚC SAI
