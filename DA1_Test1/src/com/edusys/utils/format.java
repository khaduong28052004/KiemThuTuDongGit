/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import java.text.DecimalFormat;

public class format {

    public static String formatPrice(String input) {
        String formattedPrice = "";
        try {
            // Chuyển đổi giá trị nhập vào thành số
            double price = Double.parseDouble(input);

            // Định dạng số thành chuỗi với dấu chấm phân cách
            DecimalFormat decimalFormat = new DecimalFormat("#,##0");
            formattedPrice = decimalFormat.format(price);

            // Hiển thị giá trị đã định dạng trong JTextField
        } catch (NumberFormatException | ArithmeticException ex) {
            // Xử lý lỗi nếu người dùng nhập không phải là số
        }
        return formattedPrice;
    }

    public static float round(float input) {
        double inputValue = input;
        float roundedValue = Math.round(inputValue / 1000) * 1000;
        return roundedValue;
    }
}
