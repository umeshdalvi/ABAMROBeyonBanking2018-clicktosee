package com.amazonaws.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = "{\n" + 
        		"	\"responses\": [{\n" + 
        		"		\"imagePropertiesAnnotation\": {\n" + 
        		"			\"dominantColors\": {\n" + 
        		"				\"colors\": [{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 26,\n" + 
        		"							\"green\": 25,\n" + 
        		"							\"blue\": 22\n" + 
        		"						},\n" + 
        		"						\"score\": 0.31729937,\n" + 
        		"						\"pixelFraction\": 0.14504373\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 97,\n" + 
        		"							\"green\": 77,\n" + 
        		"							\"blue\": 58\n" + 
        		"						},\n" + 
        		"						\"score\": 0.15669495,\n" + 
        		"						\"pixelFraction\": 0.04373178\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 232,\n" + 
        		"							\"green\": 233,\n" + 
        		"							\"blue\": 236\n" + 
        		"						},\n" + 
        		"						\"score\": 0.06751348,\n" + 
        		"						\"pixelFraction\": 0.059475217\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 49,\n" + 
        		"							\"green\": 47,\n" + 
        		"							\"blue\": 45\n" + 
        		"						},\n" + 
        		"						\"score\": 0.2176696,\n" + 
        		"						\"pixelFraction\": 0.12842566\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 135,\n" + 
        		"							\"green\": 109,\n" + 
        		"							\"blue\": 82\n" + 
        		"						},\n" + 
        		"						\"score\": 0.04772116,\n" + 
        		"						\"pixelFraction\": 0.03950437\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 83,\n" + 
        		"							\"green\": 84,\n" + 
        		"							\"blue\": 85\n" + 
        		"						},\n" + 
        		"						\"score\": 0.044779345,\n" + 
        		"						\"pixelFraction\": 0.06763849\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 71,\n" + 
        		"							\"green\": 56,\n" + 
        		"							\"blue\": 42\n" + 
        		"						},\n" + 
        		"						\"score\": 0.0422844,\n" + 
        		"						\"pixelFraction\": 0.011516035\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 197,\n" + 
        		"							\"green\": 197,\n" + 
        		"							\"blue\": 201\n" + 
        		"						},\n" + 
        		"						\"score\": 0.03227507,\n" + 
        		"						\"pixelFraction\": 0.07755102\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 123,\n" + 
        		"							\"green\": 125,\n" + 
        		"							\"blue\": 128\n" + 
        		"						},\n" + 
        		"						\"score\": 0.02837415,\n" + 
        		"						\"pixelFraction\": 0.14446065\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"color\": {\n" + 
        		"							\"red\": 163,\n" + 
        		"							\"green\": 163,\n" + 
        		"							\"blue\": 167\n" + 
        		"						},\n" + 
        		"						\"score\": 0.017537361,\n" + 
        		"						\"pixelFraction\": 0.17565598\n" + 
        		"					}\n" + 
        		"				]\n" + 
        		"			}\n" + 
        		"		},\n" + 
        		"	\n" + 
        		"		\"webDetection\": {\n" + 
        		"			\"webEntities\": [{\n" + 
        		"						\"entityId\": \"/g/1pznxdfs2\",\n" + 
        		"						\"score\": 1.0757506,\n" + 
        		"						\"description\": \"2014 Tesla Model S\"\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"entityId\": \"/m/0dr90d\",\n" + 
        		"						\"score\": 1.0503,\n" + 
        		"						\"description\": \"Tesla Motors\"\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"entityId\": \"/m/0j6n6s8\",\n" + 
        		"						\"score\": 1.00125,\n" + 
        		"						\"description\": \"Tesla\"\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"entityId\": \"/g/11gfk11045\",\n" + 
        		"						\"score\": 0.97755915,\n" + 
        		"						\"description\": \"2018 Tesla Model S\"\n" + 
        		"					},\n" + 
        		"					{\n" + 
        		"						\"entityId\": \"/m/0k4j\",\n" + 
        		"						\"score\": 0.95939994,\n" + 
        		"						\"description\": \"Car\"\n" + 
        		"					}\n" + 
        		"				]\n" + 
        		"\n" + 
        		"\n" + 
        		"				,\n" + 
        		"			\"bestGuessLabels\": [{\n" + 
        		"				\"label\": \"tesla model s\",\n" + 
        		"				\"languageCode\": \"en\"\n" + 
        		"			}]\n" + 
        		"		}\n" + 
        		"	}]\n" + 
        		"}	";
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();

        String output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!", "Hello from Lambda!");
    }
}
