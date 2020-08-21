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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerAxisInput/*</name>*/ 
    extends /*<extends>*/GCControllerElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerAxisInputPtr extends Ptr<GCControllerAxisInput, GCControllerAxisInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerAxisInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerAxisInput() {}
    protected GCControllerAxisInput(Handle h, long handle) { super(h, handle); }
    protected GCControllerAxisInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "valueChangedHandler")
    public native @Block VoidBlock2<GCControllerAxisInput, Float> getValueChangedHandler();
    @Property(selector = "setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCControllerAxisInput, Float> v);
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "setValue:")
    public native void setValue(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
