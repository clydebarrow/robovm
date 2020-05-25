/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.speech;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Speech") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSpeechURLRecognitionRequest/*</name>*/ 
    extends /*<extends>*/SFSpeechRecognitionRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSpeechURLRecognitionRequestPtr extends Ptr<SFSpeechURLRecognitionRequest, SFSpeechURLRecognitionRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSpeechURLRecognitionRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SFSpeechURLRecognitionRequest() {}
    protected SFSpeechURLRecognitionRequest(Handle h, long handle) { super(h, handle); }
    protected SFSpeechURLRecognitionRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public SFSpeechURLRecognitionRequest(NSURL URL) { super((SkipInit) null); initObject(init(URL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    /*</methods>*/
}
