/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author giao.lang
 */

//Ta sẽ dùng kĩ thuật Data Driven Testing/Parameterzed Testing
//tham số hóa bộ dữ liệu test
//là kĩ thuật tách bộ dữ liệu test ra hẳn câu lệnh kiểm thử hàm

//xét cho bài getF()
//Bộ data, đặt ở txt, Excel, table/db 
//0 -> 1;
//1 -> 1;
//2 -> 2;
//3 -> 6;
//4 -> 24;
//5 -> 120;

//nhồi/fill bộ data này vào trong lời gọi hàm getF() + assertEquals()
//tách bạch data và lời gọi hàm check kq 
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //chuẩn bị bộ data trước, ở txt, excel, database
    //nếu để file ngoài, thì phải viết thêm đoạn code đọc data vào...
    @Parameters   //int a[] = {2, 4, 6, 8, 10};
    public static Object[][] initData() {
        return new Integer[][] {
                                  {0, 1},
                                  {1, 1},
                                  {2, 2},
                                  {3, 6},
                                  {4, 24},
                                  {5, 120},
                               };
    }
    
    @Parameter(value = 0)
    public int n;  //bạn muốn tính mấy giai thừa
    
    @Parameter(value = 1)
    public long expected;  //bạn kì vọng giai thừa trả về mấy
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() { 
        assertEquals(expected, getFactorial(n));
    }
}
