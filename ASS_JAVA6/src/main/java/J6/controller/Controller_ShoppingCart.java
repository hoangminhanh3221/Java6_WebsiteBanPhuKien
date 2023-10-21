package J6.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class Controller_ShoppingCart {
	
	@Autowired
    private HttpServletRequest request;
	
	
	
	@GetMapping("/view")
	public String view(Model model) {
		// Đọc dữ liệu từ localStorage
        String localStorageData = (String) request.getSession().getAttribute("cart");

        // Kiểm tra xem dữ liệu có tồn tại hay không
        if (localStorageData != null) {
            // Sử dụng dữ liệu trong controller
            model.addAttribute("cart", localStorageData);
            System.out.println(localStorageData);
        } else {
            // Khởi tạo giỏ hàng nếu không có dữ liệu trong localStorage
            model.addAttribute("cart", new ArrayList<>());
        }
		return "user-page/shopping-cart";
	}
}
