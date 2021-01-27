// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Map builder

/** \class MapBuilder
 *  \brief Builder class for arrays of variable-size maps
 * 
 *  To use this class, you must append values to the key and item array builders
 *  and use the Append function to delimit each distinct map (once the keys and items
 *  have been appended) or use the bulk API to append a sequence of offsets and null
 *  maps.
 * 
 *  Key uniqueness and ordering are not validated. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MapBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapBuilder(Pointer p) { super(p); }

  /** Use this constructor to define the built array's type explicitly. If key_builder
   *  or item_builder has indeterminate type, this builder will also. */
  public MapBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder,
               @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(pool, key_builder, item_builder, type); }
  private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder,
               @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** Use this constructor to infer the built array's type. If key_builder or
   *  item_builder has indeterminate type, this builder will also. */
  public MapBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder, @Cast("bool") boolean keys_sorted/*=false*/) { super((Pointer)null); allocate(pool, key_builder, item_builder, keys_sorted); }
  private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder, @Cast("bool") boolean keys_sorted/*=false*/);
  public MapBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder) { super((Pointer)null); allocate(pool, key_builder, item_builder); }
  private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder key_builder,
               @Const @SharedPtr @ByRef ArrayBuilder item_builder);

  public MapBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder item_builder,
               @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(pool, item_builder, type); }
  private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder item_builder,
               @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);
  public native void Reset();
  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  
  ///
  public native @ByVal Status Finish(@SharedPtr MapArray out);

  /** \brief Vector append
   * 
   *  If passed, valid_bytes is of equal length to values, and any zero byte
   *  will be considered as a null for that slot */
  
  ///
  public native @ByVal Status AppendValues(@Const IntPointer offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Const IntPointer offsets, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Const IntBuffer offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Const IntBuffer offsets, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Const int[] offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Const int[] offsets, @Cast("int64_t") long length);

  /** \brief Start a new variable-length map slot
   * 
   *  This function should be called before beginning to append elements to the
   *  key and item builders */
  public native @ByVal Status Append();

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status AppendEmptyValue();

  
  ///
  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  /** \brief Get builder to append keys.
   * 
   *  Append a key with this builder should be followed by appending
   *  an item or null value with item_builder(). */
  
  ///
  public native ArrayBuilder key_builder();

  /** \brief Get builder to append items
   * 
   *  Appending an item with this builder should have been preceded
   *  by appending a key with key_builder(). */
  
  ///
  public native ArrayBuilder item_builder();

  /** \brief Get builder to add Map entries as struct values.
   * 
   *  This is used instead of key_builder()/item_builder() and allows
   *  the Map to be built as a list of struct values. */
  public native ArrayBuilder value_builder();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  public native @ByVal Status ValidateOverflow(@Cast("int64_t") long new_elements);
}
