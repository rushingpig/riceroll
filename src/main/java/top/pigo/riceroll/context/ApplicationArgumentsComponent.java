package top.pigo.riceroll.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author : zhuzhenglin
 * @Date : 16/9/30 00:21
 * @Email : zhenglin.zhu@xfxb.net
 * @Since : v1.0
 */
@Component
public class ApplicationArgumentsComponent {

    @Autowired
    public ApplicationArgumentsComponent(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
    }

}
