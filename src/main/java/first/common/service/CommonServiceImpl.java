package first.common.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.common.dao.CommonDAO;

@Service("commonService")
public class CommonServiceImpl implements CommonService{
   Logger log = Logger.getLogger(this.getClass());
    
   @Resource(name="commonDAO")
   private CommonDAO commonDAO;
}