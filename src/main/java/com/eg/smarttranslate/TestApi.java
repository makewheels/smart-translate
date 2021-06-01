package com.eg.smarttranslate;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestApi {
    public static void main(String[] args) {
        String s = HttpUtil.get("https://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=auto&tl=en_US&q=随着《赛博朋克2077》大火，想必不少玩家已经进入赛博朋克世界，你的配置能开什么画质？1050ti能玩2077吗？2060有没有压力？想要在2K/4K分辨率下光追畅玩《赛博朋克2077》，高性能优秀的显卡是必不可少的。");
        String pretty = JSON.toJSONString(JSON.parseObject(s), SerializerFeature.PrettyFormat);
        System.out.println(pretty);
    }
}
