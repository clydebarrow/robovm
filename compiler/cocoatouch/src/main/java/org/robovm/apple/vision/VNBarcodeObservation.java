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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNBarcodeObservation/*</name>*/ 
    extends /*<extends>*/VNRectangleObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNBarcodeObservationPtr extends Ptr<VNBarcodeObservation, VNBarcodeObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNBarcodeObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNBarcodeObservation() {}
    protected VNBarcodeObservation(Handle h, long handle) { super(h, handle); }
    protected VNBarcodeObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "symbology")
    public native String getSymbology();
    @Property(selector = "barcodeDescriptor")
    public native CIBarcodeDescriptor getBarcodeDescriptor();
    @Property(selector = "payloadStringValue")
    public native String getPayloadStringValue();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "payloadData")
    public native NSData getPayloadData();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isGS1DataCarrier")
    public native boolean isGS1DataCarrier();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isColorInverted")
    public native boolean isColorInverted();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supplementalCompositeType")
    public native VNBarcodeCompositeType getSupplementalCompositeType();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supplementalPayloadString")
    public native String getSupplementalPayloadString();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supplementalPayloadData")
    public native NSData getSupplementalPayloadData();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "rectangleObservationWithRequestRevision:topLeft:topRight:bottomRight:bottomLeft:")
    public static native VNBarcodeObservation create(@MachineSizedUInt long requestRevision, @ByVal CGPoint topLeft, @ByVal CGPoint topRight, @ByVal CGPoint bottomRight, @ByVal CGPoint bottomLeft);
    /*</methods>*/
}
