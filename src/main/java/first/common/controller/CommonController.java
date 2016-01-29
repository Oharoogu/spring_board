package first.common.controller;
 
import javax.annotation.Resource;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
 
import first.common.service.CommonService;
 
@Controller
public class CommonController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="commonService")
    private CommonService commonService;
}