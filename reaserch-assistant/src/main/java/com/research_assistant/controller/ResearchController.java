package com.research_assistant.controller;

import com.research_assistant.model.ResearchRequest;
import com.research_assistant.service.ResearchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ResearchController {

    private final ResearchService researchService;


    @PostMapping("/process")
    public String processContent(@RequestParam String content,
                                 @RequestParam String operation,
                                 Model model) {
        ResearchRequest request = new ResearchRequest();
        request.setContent(content);
        request.setOperation(operation);
        String result = researchService.processContent(request);
        model.addAttribute("result", result);
        return "index";
    }
}

