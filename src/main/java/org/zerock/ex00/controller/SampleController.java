package org.zerock.ex00.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.ex00.domain.SampleDTO;
import org.zerock.ex00.domain.SampleDTOList;
import org.zerock.ex00.domain.TodoDTO;

@Controller
@Log4j2
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/basic")
    public void basic() {
        log.info("basic---------------------------");
    }

    @GetMapping("/ex1")
    public void ex1(SampleDTO sampleDTO) {
        log.info("ex1--------------------------");
        log.info(sampleDTO);
    }

    @GetMapping("/ex02Bean")
    public void ex02Bean(SampleDTOList list) {
        log.info(list);
    }

//    @GetMapping("/ex1")
//    public void ex1(@RequestParam String name, @RequestParam(value = "age", required = false, defaultValue = "10") int age) {
//        log.info("ex1----------------------");
//        log.info(name);
//        log.info(age);
//    }

    @GetMapping("/ex03")
    public void ex03(TodoDTO todoDTO) {
        log.info("-----------------");
        log.info(todoDTO);
    }
}
