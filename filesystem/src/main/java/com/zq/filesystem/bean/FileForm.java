package com.zq.filesystem.bean;

import lombok.Data;

/**
 * @author zhouqi
 * @desc
 * @data 2020/9/23
 */
@Data
public class FileForm {

    private String md5;

    private String uuid;

    private String date;

    private String name;

    private String size;

    private String total;

    private String index;

    private String action;

    private String partMd5;

}
