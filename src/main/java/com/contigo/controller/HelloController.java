package com.contigo.controller;
import com.contigo.domain.Ride;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by nithin on 7/17/2016.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

        private static final Logger logger = Logger.getLogger(HelloController.class);

        @RequestMapping(method = RequestMethod.GET)
        @ResponseBody
        public Ride getWelcome() {

            //logs debug message
                if(logger.isDebugEnabled()){
                    logger.debug("getWelcome is executed!");
                }

            //logs exception
            //logger.error("This is Error message", new Exception("Testing"));

            return new Ride();

        }

    }

