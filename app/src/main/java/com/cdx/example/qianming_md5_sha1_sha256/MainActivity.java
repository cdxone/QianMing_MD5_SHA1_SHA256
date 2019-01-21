package com.cdx.example.qianming_md5_sha1_sha256;

import com.cdx.example.qianming_md5_sha1_sha256.activity.KnowledgeActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {


    @Override
    protected void initData() {
        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("签名_MD5_SHA1_SHA256知识",KnowledgeActivity.class));
        mMyListView.setData(data);
    }
}
