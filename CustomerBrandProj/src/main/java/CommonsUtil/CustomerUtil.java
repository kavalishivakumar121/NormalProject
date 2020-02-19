package CommonsUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.app.model.ProductBrand;
import com.app.service.ICustomerService;

@Component
public class CustomerUtil {
@Autowired
	private ICustomerService service;

public void addUiComponent(ModelMap map)
{
	List<ProductBrand> values=service.getBrand("");
	map.addAttribute("value",values);
	}
}
