package MagicNumbers.Controllers;

import MagicNumbers.app.MagicNumbers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class LoadFileController {

    @RequestMapping(value = "/loadFile", method = RequestMethod.POST)
    public String loadFile(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
        File convertedFile = MagicNumbers.convertMultipartFileToFile(file);
        String message = MagicNumbers.checkTheFile(convertedFile);
        modelMap.addAttribute("message", message);
        return "typeFileConfirmation";
    }


    @RequestMapping(value = "/showLoadFileForm")
    public String showLoadingForm(){
        return "fileLoadingForm";
    }

}
