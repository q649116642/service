package com.lovo.servlet.mabaits;

import com.lovo.service.mybaits.HeroBuilder;
import com.lovo.service.mybaits.Hreo;
import com.lovo.service.mybaits.VNBasic;
import com.lovo.service.mybaits.makeHreo;
import org.junit.Test;

public class TBuilt {
    @Test
    public  void testBuilder(){
        //构建者开始构建
        HeroBuilder hb=new VNBasic();
        //生产者
        makeHreo mk=new makeHreo(hb);
        mk.build();
        Hreo h=mk.getHero();
        System.out.printf(h.getKill()+h.getKien()+h.getPymbol());



    }
}
