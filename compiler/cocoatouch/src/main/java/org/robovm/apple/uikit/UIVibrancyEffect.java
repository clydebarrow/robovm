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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/
import org.robovm.rt.annotation.WeaklyLinked;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIVibrancyEffect/*</name>*/ 
    extends /*<extends>*/UIVisualEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIVibrancyEffectPtr extends Ptr<UIVibrancyEffect, UIVibrancyEffectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIVibrancyEffect.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIVibrancyEffect() {}
    protected UIVibrancyEffect(Handle h, long handle) { super(h, handle); }
    protected UIVibrancyEffect(SkipInit skipInit) { super(skipInit); }
    public UIVibrancyEffect(UIBlurEffect blurEffect) { super((Handle) null, create(blurEffect)); retain(getHandle()); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public UIVibrancyEffect(UIBlurEffect blurEffect, UIVibrancyEffectStyle style) { super((Handle) null, create(blurEffect, style)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /* NotificationCenter extensions */
    @WeaklyLinked
    public static UIVibrancyEffect createNotificationCenterEffect() {
        return org.robovm.apple.notificationcenter.UIVibrancyEffectExtensions.createNotificationCenterEffect();
    }
    
    /*<methods>*/
    @Method(selector = "effectForBlurEffect:")
    protected static native @Pointer long create(UIBlurEffect blurEffect);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "effectForBlurEffect:style:")
    protected static native @Pointer long create(UIBlurEffect blurEffect, UIVibrancyEffectStyle style);
    /*</methods>*/
}
