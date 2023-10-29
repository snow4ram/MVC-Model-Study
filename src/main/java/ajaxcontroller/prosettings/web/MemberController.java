package ajaxcontroller.prosettings.web;


import ajaxcontroller.prosettings.repository.Repository;
import ajaxcontroller.prosettings.domain.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private final Repository repository;


    @GetMapping("/save")
    public String imageSave() {
        return "html/login";
    }

    @PostMapping("/save")
    public String imageResult(@ModelAttribute("member") final MemberRequest request) {

        log.info("member = {}" , request);

        repository.save(request);


        return  "redirect:/list";
    }

    @GetMapping("/list")
    public String listAll(Model model) {

        List<Member> all = repository.findAll();

        model.addAttribute("all" , all);

        return "html/member_list";
    }


}
