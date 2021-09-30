/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtil {

    //viết hàm toán học tính giai thừa n! = 1.2.3...n
    //quy ước: 0! = 1! = 1
    //ko có giai thừa của số âm
    //21! tràn kiểu long, long: 18 số 0
    //túm lại: hàm tính giai thừa của n = 0...20
    //Ta xài luôn kĩ thuật lập trình TDD-Test Driven Development
    //                               Test First Development
    //ta nghĩ về test, kịch bản test, bộ dữ liệu test trước khi code
    
    //Đệ quy, recursion, gọi lại chính mình với 1 quy mô khác
    //con búp bê người Nga
    //5! = 1.2.3.4.5
    //5! = 5 * 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //1! = 1, dừng luôn
    //n! = n * (n - 1)! công thức đệ quy lặp lại chính mình với quy mô khác
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n == 1)
            return 1; //điều kiện dừng của đệ quy
        return n * getFactorial(n - 1);  //done đệ quy
    }
    
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        long product = 1;  
//        
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
           
    // y = f(x) = x^2
    //     f(5) -> 25
    
    //sure, getF(5) -> 120
    //      getF(6) -> 720
    
    
}
