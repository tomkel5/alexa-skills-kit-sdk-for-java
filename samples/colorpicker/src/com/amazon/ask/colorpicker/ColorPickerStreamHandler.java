/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.colorpicker;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.ask.colorpicker.handlers.FallbackIntentHandler;
import com.amazon.ask.colorpicker.handlers.HelpIntentHandler;
import com.amazon.ask.colorpicker.handlers.LaunchRequestHandler;
import com.amazon.ask.colorpicker.handlers.SessionEndedRequestHandler;
import com.amazon.ask.colorpicker.handlers.WhatsMyColorIntentHandler;
import com.amazon.ask.colorpicker.handlers.CancelandStopIntentHandler;
import com.amazon.ask.colorpicker.handlers.MyColorIsIntentHandler;

public class ColorPickerStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new WhatsMyColorIntentHandler(),
                        new MyColorIsIntentHandler(),
                        new LaunchRequestHandler(),
                        new CancelandStopIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public ColorPickerStreamHandler() {
        super(getSkill());
    }

}
