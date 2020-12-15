// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \struct dnnl_primitive_attr
 *  \brief An opaque structure for primitive descriptor attributes.
 * 
 *  Attributes may contain:
 *   - output scales (to scale the result prior to storing it to the memory) */
@Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_primitive_attr extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_primitive_attr() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_primitive_attr(Pointer p) { super(p); }
}
