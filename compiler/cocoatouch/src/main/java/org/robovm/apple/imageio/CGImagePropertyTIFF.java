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
package org.robovm.apple.imageio;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CGImagePropertyTIFF/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyTIFF/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyTIFF/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyTIFF toObject(Class<CGImagePropertyTIFF> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyTIFF.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyTIFF o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyTIFF> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyTIFF> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyTIFF.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyTIFF> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyTIFF o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CGImagePropertyTIFF Compression = new CGImagePropertyTIFF("Compression");
    public static final CGImagePropertyTIFF PhotometricInterpretation = new CGImagePropertyTIFF("PhotometricInterpretation");
    public static final CGImagePropertyTIFF DocumentName = new CGImagePropertyTIFF("DocumentName");
    public static final CGImagePropertyTIFF ImageDescription = new CGImagePropertyTIFF("ImageDescription");
    public static final CGImagePropertyTIFF Make = new CGImagePropertyTIFF("Make");
    public static final CGImagePropertyTIFF Model = new CGImagePropertyTIFF("Model");
    public static final CGImagePropertyTIFF Orientation = new CGImagePropertyTIFF("Orientation");
    public static final CGImagePropertyTIFF XResolution = new CGImagePropertyTIFF("XResolution");
    public static final CGImagePropertyTIFF YResolution = new CGImagePropertyTIFF("YResolution");
    public static final CGImagePropertyTIFF ResolutionUnit = new CGImagePropertyTIFF("ResolutionUnit");
    public static final CGImagePropertyTIFF Software = new CGImagePropertyTIFF("Software");
    public static final CGImagePropertyTIFF TransferFunction = new CGImagePropertyTIFF("TransferFunction");
    public static final CGImagePropertyTIFF DateTime = new CGImagePropertyTIFF("DateTime");
    public static final CGImagePropertyTIFF Artist = new CGImagePropertyTIFF("Artist");
    public static final CGImagePropertyTIFF HostComputer = new CGImagePropertyTIFF("HostComputer");
    public static final CGImagePropertyTIFF Copyright = new CGImagePropertyTIFF("Copyright");
    public static final CGImagePropertyTIFF WhitePoint = new CGImagePropertyTIFF("WhitePoint");
    public static final CGImagePropertyTIFF PrimaryChromaticities = new CGImagePropertyTIFF("PrimaryChromaticities");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CGImagePropertyTIFF TileWidth = new CGImagePropertyTIFF("TileWidth");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CGImagePropertyTIFF TileLength = new CGImagePropertyTIFF("TileLength");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyTIFF/*</name>*/[] values = new /*<name>*/CGImagePropertyTIFF/*</name>*/[] {/*<value_list>*/Compression, PhotometricInterpretation, DocumentName, ImageDescription, Make, Model, Orientation, XResolution, YResolution, ResolutionUnit, Software, TransferFunction, DateTime, Artist, HostComputer, Copyright, WhitePoint, PrimaryChromaticities, TileWidth, TileLength/*</value_list>*/};
    
    /*<name>*/CGImagePropertyTIFF/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyTIFF/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyTIFF/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyTIFF/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCGImagePropertyTIFFCompression", optional=true)
        public static native CFString Compression();
        @GlobalValue(symbol="kCGImagePropertyTIFFPhotometricInterpretation", optional=true)
        public static native CFString PhotometricInterpretation();
        @GlobalValue(symbol="kCGImagePropertyTIFFDocumentName", optional=true)
        public static native CFString DocumentName();
        @GlobalValue(symbol="kCGImagePropertyTIFFImageDescription", optional=true)
        public static native CFString ImageDescription();
        @GlobalValue(symbol="kCGImagePropertyTIFFMake", optional=true)
        public static native CFString Make();
        @GlobalValue(symbol="kCGImagePropertyTIFFModel", optional=true)
        public static native CFString Model();
        @GlobalValue(symbol="kCGImagePropertyTIFFOrientation", optional=true)
        public static native CFString Orientation();
        @GlobalValue(symbol="kCGImagePropertyTIFFXResolution", optional=true)
        public static native CFString XResolution();
        @GlobalValue(symbol="kCGImagePropertyTIFFYResolution", optional=true)
        public static native CFString YResolution();
        @GlobalValue(symbol="kCGImagePropertyTIFFResolutionUnit", optional=true)
        public static native CFString ResolutionUnit();
        @GlobalValue(symbol="kCGImagePropertyTIFFSoftware", optional=true)
        public static native CFString Software();
        @GlobalValue(symbol="kCGImagePropertyTIFFTransferFunction", optional=true)
        public static native CFString TransferFunction();
        @GlobalValue(symbol="kCGImagePropertyTIFFDateTime", optional=true)
        public static native CFString DateTime();
        @GlobalValue(symbol="kCGImagePropertyTIFFArtist", optional=true)
        public static native CFString Artist();
        @GlobalValue(symbol="kCGImagePropertyTIFFHostComputer", optional=true)
        public static native CFString HostComputer();
        @GlobalValue(symbol="kCGImagePropertyTIFFCopyright", optional=true)
        public static native CFString Copyright();
        @GlobalValue(symbol="kCGImagePropertyTIFFWhitePoint", optional=true)
        public static native CFString WhitePoint();
        @GlobalValue(symbol="kCGImagePropertyTIFFPrimaryChromaticities", optional=true)
        public static native CFString PrimaryChromaticities();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyTIFFTileWidth", optional=true)
        public static native CFString TileWidth();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyTIFFTileLength", optional=true)
        public static native CFString TileLength();
        /*</values>*/
    }
}
