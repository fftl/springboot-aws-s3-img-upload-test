//package fftl.example.test.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//@RequiredArgsConstructor
//@Controller
//public class WebController {
//
//    private final AwsService awsService;
//
//	@PostMapping("/obj/img-put")
//	public @ResponseBody String uploadImages(@RequestParam("files") MultipartFile[] files)throws Exception
//    {
//    	String s3Path = "/images";
//		awsService.uploadMultipartFile(files,s3Path);
//
//		return "success";
//	}
//}
