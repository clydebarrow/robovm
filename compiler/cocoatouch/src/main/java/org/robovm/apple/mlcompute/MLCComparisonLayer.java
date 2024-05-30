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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.5 and later.
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCComparisonLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCComparisonLayerPtr extends Ptr<MLCComparisonLayer, MLCComparisonLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCComparisonLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCComparisonLayer() {}
    protected MLCComparisonLayer(Handle h, long handle) { super(h, handle); }
    protected MLCComparisonLayer(SkipInit skipInit) { super(skipInit); }
    public MLCComparisonLayer(MLCComparisonOperation operation) { super((Handle) null, create(operation)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "operation")
    public native MLCComparisonOperation getOperation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithOperation:")
    protected static native @Pointer long create(MLCComparisonOperation operation);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
