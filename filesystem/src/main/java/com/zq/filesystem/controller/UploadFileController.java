package com.zq.filesystem.controller;

import com.zq.filesystem.bean.FileForm;
import com.zq.filesystem.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2020/9/23
 */
@RestController
@RequestMapping("/upload/file")
public class UploadFileController {

    @Autowired
    UploadFileService uploadFileService;

    @GetMapping("/open")
    public ModelAndView open(){
        return new ModelAndView("upload");
    }

    @PostMapping("/isUpload")
    public Map<String, Object> isUpload(@Valid FileForm form) {

        return uploadFileService.findByFileMd5(form.getMd5());

    }

    @PostMapping("/upload")
    public Map<String, Object> upload(@Valid FileForm form,
                                      @RequestParam(value = "data", required = false) MultipartFile multipartFile) {
        Map<String, Object> map = null;

        try {
            map = uploadFileService.realUpload(form, multipartFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}
