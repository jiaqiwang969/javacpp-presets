// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow.global;

import org.bytedeco.arrow_dataset.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

public class arrow_dataset extends org.bytedeco.arrow.presets.arrow_dataset {
    static { Loader.load(); }

// Targeting ../../arrow_dataset/FileFragmentVector.java


// Targeting ../../arrow_dataset/ScanTaskVector.java


// Targeting ../../arrow_dataset/StringUnorderedSet.java


// Parsed from arrow/util/iterator.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <cassert>
// #include <functional>
// #include <memory>
// #include <tuple>
// #include <type_traits>
// #include <utility>
// #include <vector>

// #include "arrow/result.h"
// #include "arrow/status.h"
// #include "arrow/util/compare.h"
// #include "arrow/util/functional.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/optional.h"
// #include "arrow/util/visibility.h"
// Targeting ../../arrow_dataset/FragmentIterator.java


// Targeting ../../arrow_dataset/ScanTaskIterator.java



/** \brief Construct an Iterator which invokes a callable on Next() */

/** \brief Simple iterator which yields the elements of a std::vector */

/** \brief Simple iterator which yields *pointers* to the elements of a std::vector<T>.
 *  This is provided to support T where IterationTraits<T>::End is not specialized */

/** \brief MapIterator takes ownership of an iterator and a function to apply
 *  on every element. The mapped function is not allowed to fail. */

/** \brief MapIterator takes ownership of an iterator and a function to apply
 *  on every element. The mapped function is not allowed to fail. */
// Targeting ../../arrow_dataset/FilterIterator.java



/** \brief Like MapIterator, but where the function can fail or reject elements. */

/** \brief FlattenIterator takes an iterator generating iterators and yields a
 *  unified iterator that flattens/concatenates in a single stream. */
// Targeting ../../arrow_dataset/ReadaheadPromise.java


// Targeting ../../arrow_dataset/ReadaheadQueue.java



  // namespace detail

/** \brief Readahead iterator that iterates on the underlying iterator in a
 *  separate thread, getting up to N values in advance. */

  // namespace arrow


// Parsed from arrow/result.h

//
// Copyright 2017 Asylo authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Adapted from Asylo

// #pragma once

// #include <cstddef>
// #include <new>
// #include <string>
// #include <type_traits>
// #include <utility>

// #include "arrow/status.h"
// #include "arrow/util/compare.h"
// Targeting ../../arrow_dataset/EnsureResult.java



// #if __cplusplus >= 201703L
// #else
// #endif

@Namespace("arrow::internal") public static native void DieWithMessage(@StdString String msg);
@Namespace("arrow::internal") public static native void DieWithMessage(@StdString BytePointer msg);

@Namespace("arrow::internal") public static native void InvalidValueOrDie(@Const @ByRef Status st);


// Targeting ../../arrow_dataset/DatasetResult.java


// Targeting ../../arrow_dataset/DatasetFactoryResult.java


// Targeting ../../arrow_dataset/FileSystemDatasetResult.java


// Targeting ../../arrow_dataset/FileFragmentResult.java


// Targeting ../../arrow_dataset/FileWriterResult.java


// Targeting ../../arrow_dataset/FragmentResult.java


// Targeting ../../arrow_dataset/ParquetFileFragmentResult.java


// Targeting ../../arrow_dataset/PartitioningResult.java


// Targeting ../../arrow_dataset/ScannerResult.java


// Targeting ../../arrow_dataset/ScannerBuilderResult.java


// Targeting ../../arrow_dataset/ScanTaskResult.java


// Targeting ../../arrow_dataset/FileReaderResult.java


// Targeting ../../arrow_dataset/ExpressionResult.java


// Targeting ../../arrow_dataset/PartitionedBatchesResult.java


// Targeting ../../arrow_dataset/UnionDatasetResult.java


// Targeting ../../arrow_dataset/FragmentIteratorResult.java


// Targeting ../../arrow_dataset/ScanTaskIteratorResult.java


// Targeting ../../arrow_dataset/ScanTaskVectorResult.java


// Targeting ../../arrow_dataset/FragmentVectorResult.java



// #define ARROW_ASSIGN_OR_RAISE_IMPL(result_name, lhs, rexpr)
//   auto&& result_name = (rexpr);
//   ARROW_RETURN_NOT_OK((result_name).status());
//   lhs = std::move(result_name).ValueUnsafe();


///
///
///
///
// #define ARROW_ASSIGN_OR_RAISE_NAME(x, y) ARROW_CONCAT(x, y)

/** \brief Execute an expression that returns a Result, extracting its value
 *  into the variable defined by {@code lhs} (or returning a Status on error).
 * 
 *  Example: Assigning to a new value:
 *    ARROW_ASSIGN_OR_RAISE(auto value, MaybeGetValue(arg));
 * 
 *  Example: Assigning to an existing value:
 *    ValueType value;
 *    ARROW_ASSIGN_OR_RAISE(value, MaybeGetValue(arg));
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE expands into multiple statements;
 *  it cannot be used in a single statement (e.g. as the body of an if
 *  statement without {})!
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE {@code std::move}s its right operand. If you have
 *  an lvalue Result which you *don't* want to move out of cast appropriately. */
// #define ARROW_ASSIGN_OR_RAISE(lhs, rexpr)
//   ARROW_ASSIGN_OR_RAISE_IMPL(ARROW_ASSIGN_OR_RAISE_NAME(_error_or_value, __COUNTER__),
//                              lhs, rexpr);

  // namespace internal

  // namespace arrow


// Parsed from arrow/dataset/api.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/discovery.h"
// #include "arrow/dataset/expression.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/file_csv.h"
// #include "arrow/dataset/file_ipc.h"
// #include "arrow/dataset/file_parquet.h"
// #include "arrow/dataset/scanner.h"


// Parsed from arrow/dataset/expression.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <atomic>
// #include <memory>
// #include <string>
// #include <unordered_map>
// #include <utility>
// #include <vector>

// #include "arrow/compute/type_fwd.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/datum.h"
// #include "arrow/type_fwd.h"
// #include "arrow/util/variant.h"
// Targeting ../../arrow_dataset/Expression.java



@Namespace("arrow::dataset") public static native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Expression l, @Const @ByRef Expression r);
@Namespace("arrow::dataset") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Expression l, @Const @ByRef Expression r);

// Factories

@Namespace("arrow::dataset") public static native @ByVal Expression literal(@ByVal Datum lit);

@Namespace("arrow::dataset") public static native @ByVal Expression field_ref(@ByVal FieldRef ref);

@Namespace("arrow::dataset") public static native @ByVal Expression call(@StdString String function, @StdVector Expression arguments,
                @SharedPtr FunctionOptions options/*=nullptr*/);
@Namespace("arrow::dataset") public static native @ByVal Expression call(@StdString String function, @StdVector Expression arguments);
@Namespace("arrow::dataset") public static native @ByVal Expression call(@StdString BytePointer function, @StdVector Expression arguments,
                @SharedPtr FunctionOptions options/*=nullptr*/);
@Namespace("arrow::dataset") public static native @ByVal Expression call(@StdString BytePointer function, @StdVector Expression arguments);

/** Assemble a list of all fields referenced by an Expression at any depth. */
@Namespace("arrow::dataset") public static native @StdVector FieldRef FieldsInExpression(@Const @ByRef Expression arg0);

/** Assemble a mapping from field references to known values. */

///
///
@Namespace("arrow::dataset") public static native @ByVal FieldRefDatumMapResult ExtractKnownFieldValues(
    @Const @ByRef Expression guaranteed_true_predicate);

/** \defgroup expression-passes Functions for modification of Expressions
 * 
 *  \{
 * 
 *  These transform bound expressions. Some transforms utilize a guarantee, which is
 *  provided as an Expression which is guaranteed to evaluate to true. The
 *  guaranteed_true_predicate need not be bound, but canonicalization is currently
 *  deferred to producers of guarantees. For example in order to be recognized as a
 *  guarantee on a field value, an Expression must be a call to "equal" with field_ref LHS
 *  and literal RHS. Flipping the arguments, "is_in" with a one-long value_set, ... or
 *  other semantically identical Expressions will not be recognized.
 <p>
 *  Weak canonicalization which establishes guarantees for subsequent passes. Even
 *  equivalent Expressions may result in different canonicalized expressions.
 *  TODO this could be a strong canonicalization */
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult Canonicalize(@ByVal Expression arg0, ExecContext arg1/*=nullptr*/);
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult Canonicalize(@ByVal Expression arg0);

/** Simplify Expressions based on literal arguments (for example, add(null, x) will always
 *  be null so replace the call with a null literal). Includes early evaluation of all
 *  calls whose arguments are entirely literal. */
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult FoldConstants(@ByVal Expression arg0);

/** Simplify Expressions by replacing with known values of the fields which it references. */
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult ReplaceFieldsWithKnownValues(
    @Const @ByRef FieldRefDatumMap known_values, @ByVal Expression arg1);

/** Simplify an expression by replacing subexpressions based on a guarantee:
 *  a boolean expression which is guaranteed to evaluate to {@code true}. For example, this is
 *  used to remove redundant function calls from a filter expression or to replace a
 *  reference to a constant-value field with a literal. */
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult SimplifyWithGuarantee(@ByVal Expression arg0,
                                         @Const @ByRef Expression guaranteed_true_predicate);

/** \} */

// Execution

/** Execute a scalar expression against the provided state and input Datum. This
/** expression must be bound. */
@Namespace("arrow::dataset") public static native @ByVal DatumResult ExecuteScalarExpression(@Const @ByRef Expression arg0, @Const @ByRef Datum input,
                                      ExecContext arg2/*=nullptr*/);
@Namespace("arrow::dataset") public static native @ByVal DatumResult ExecuteScalarExpression(@Const @ByRef Expression arg0, @Const @ByRef Datum input);

// Serialization

@Namespace("arrow::dataset") public static native @ByVal BufferResult Serialize(@Const @ByRef Expression arg0);

@Namespace("arrow::dataset") public static native @ByVal ExpressionResult Deserialize(@SharedPtr ArrowBuffer arg0);

// Convenience aliases for factories

@Namespace("arrow::dataset") public static native @ByVal Expression project(@StdVector Expression values,
                                   @ByVal StringVector names);

@Namespace("arrow::dataset") public static native @ByVal Expression equal(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression not_equal(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression less(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression less_equal(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression greater(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression greater_equal(@ByVal Expression lhs, @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal Expression and_(@ByVal Expression lhs, @ByVal Expression rhs);
@Namespace("arrow::dataset") public static native @ByVal Expression and_(@StdVector Expression arg0);
@Namespace("arrow::dataset") public static native @ByVal Expression or_(@ByVal Expression lhs, @ByVal Expression rhs);
@Namespace("arrow::dataset") public static native @ByVal Expression or_(@StdVector Expression arg0);
@Namespace("arrow::dataset") public static native @ByVal Expression not_(@ByVal Expression operand);

  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/visibility.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #if defined(_WIN32) || defined(__CYGWIN__)
// #if defined(_MSC_VER)
// #pragma warning(push)
// #pragma warning(disable : 4251)
// #else
// #pragma GCC diagnostic ignored "-Wattributes"
// #endif

// #ifdef ARROW_DS_STATIC
// #define ARROW_DS_EXPORT
// #elif defined(ARROW_DS_EXPORTING)
// #define ARROW_DS_EXPORT __declspec(dllexport)
// #else
// #define ARROW_DS_EXPORT __declspec(dllimport)
// #endif

// #define ARROW_DS_NO_EXPORT
// #else  // Not Windows
// #ifndef ARROW_DS_EXPORT
// #define ARROW_DS_EXPORT __attribute__((visibility("default")))
// #endif
// #ifndef ARROW_DS_NO_EXPORT
// #define ARROW_DS_NO_EXPORT __attribute__((visibility("hidden")))
// #endif
// #endif  // Non-Windows

// #if defined(_MSC_VER)
// #pragma warning(pop)
// #endif


// Parsed from arrow/dataset/type_fwd.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <vector>

// #include "arrow/dataset/visibility.h"
// #include "arrow/filesystem/type_fwd.h"  // IWYU pragma: export
// #include "arrow/type_fwd.h"             // IWYU pragma: export

  // namespace compute

  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/dataset.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <functional>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/expression.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/mutex.h"
// Targeting ../../arrow_dataset/Fragment.java


// Targeting ../../arrow_dataset/InMemoryFragment.java


// Targeting ../../arrow_dataset/Dataset.java


// Targeting ../../arrow_dataset/InMemoryDataset.java


// Targeting ../../arrow_dataset/UnionDataset.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/partition.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <functional>
// #include <memory>
// #include <string>
// #include <unordered_map>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/expression.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/optional.h"
// Targeting ../../arrow_dataset/Partitioning.java


// Targeting ../../arrow_dataset/PartitioningFactoryOptions.java


// Targeting ../../arrow_dataset/PartitioningFactory.java


// Targeting ../../arrow_dataset/KeyValuePartitioning.java


// Targeting ../../arrow_dataset/DirectoryPartitioning.java


// Targeting ../../arrow_dataset/HivePartitioning.java


// Targeting ../../arrow_dataset/FunctionPartitioning.java



/** \brief Remove a prefix and the filename of a path.
 * 
 *  e.g., {@code StripPrefixAndFilename("/data/year=2019/c.txt", "/data") -> "year=2019"} */
@Namespace("arrow::dataset") public static native @StdString String StripPrefixAndFilename(@StdString String path,
                                                   @StdString String prefix);
@Namespace("arrow::dataset") public static native @StdString BytePointer StripPrefixAndFilename(@StdString BytePointer path,
                                                   @StdString BytePointer prefix);

/** \brief Vector version of StripPrefixAndFilename. */
@Namespace("arrow::dataset") public static native @ByVal StringVector StripPrefixAndFilename(
    @Const @ByRef StringVector paths, @StdString String prefix);
@Namespace("arrow::dataset") public static native @ByVal StringVector StripPrefixAndFilename(
    @Const @ByRef StringVector paths, @StdString BytePointer prefix);

/** \brief Vector version of StripPrefixAndFilename. */
@Namespace("arrow::dataset") public static native @ByVal StringVector StripPrefixAndFilename(
    @StdVector FileInfo files, @StdString String prefix);
@Namespace("arrow::dataset") public static native @ByVal StringVector StripPrefixAndFilename(
    @StdVector FileInfo files, @StdString BytePointer prefix);
// Targeting ../../arrow_dataset/PartitioningOrFactory.java



/** \brief Assemble lists of indices of identical rows.
 * 
 *  @param by [in] A StructArray whose columns will be used as grouping criteria.
 *                Top level nulls are invalid, as are empty criteria (no grouping
 *                columns).
 *  @return A array of type {@code struct<values: by.type, groupings: list<int64>>},
 *          which is a mapping from unique rows (field "values") to lists of
 *          indices into {@code by} where that row appears (field "groupings").
 * 
 *  For example,
 *    MakeGroupings([
 *        {"a": "ex",  "b": 0},
 *        {"a": "ex",  "b": 0},
 *        {"a": "why", "b": 0},
 *        {"a": "why", "b": 0},
 *        {"a": "ex",  "b": 0},
 *        {"a": "why", "b": 1}
 *    ]) == [
 *        {"values": {"a": "ex",  "b": 0}, "groupings": [0, 1, 4]},
 *        {"values": {"a": "why", "b": 0}, "groupings": [2, 3]},
 *        {"values": {"a": "why", "b": 1}, "groupings": [5]}
 *    ] */

///
@Namespace("arrow::dataset") public static native @ByVal StructArrayResult MakeGroupings(@Const @ByRef StructArray by);

/** \brief Produce a ListArray whose slots are selections of {@code array} which correspond to
 *  the provided groupings.
 * 
 *  For example,
 *    ApplyGroupings([[0, 1, 4], [2, 3], [5]], [
 *        {"a": "ex",  "b": 0, "passenger": 0},
 *        {"a": "ex",  "b": 0, "passenger": 1},
 *        {"a": "why", "b": 0, "passenger": 2},
 *        {"a": "why", "b": 0, "passenger": 3},
 *        {"a": "ex",  "b": 0, "passenger": 4},
 *        {"a": "why", "b": 1, "passenger": 5}
 *    ]) == [
 *      [
 *        {"a": "ex",  "b": 0, "passenger": 0},
 *        {"a": "ex",  "b": 0, "passenger": 1},
 *        {"a": "ex",  "b": 0, "passenger": 4},
 *      ],
 *      [
 *        {"a": "why", "b": 0, "passenger": 2},
 *        {"a": "why", "b": 0, "passenger": 3},
 *      ],
 *      [
 *        {"a": "why", "b": 1, "passenger": 5}
 *      ]
 *    ] */
@Namespace("arrow::dataset") public static native @ByVal ListArrayResult ApplyGroupings(@Const @ByRef ListArray groupings,
                                                  @Const @ByRef Array array);

/** \brief Produce selections of a RecordBatch which correspond to the provided groupings. */
@Namespace("arrow::dataset") public static native @ByVal RecordBatchVectorResult ApplyGroupings(@Const @ByRef ListArray groupings,
                                         @SharedPtr @Cast({"", "std::shared_ptr<arrow::RecordBatch>"}) RecordBatch batch);

  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/discovery.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/** Logic for automatically determining the structure of multi-file
 *  dataset with possible partitioning according to available
 *  partitioning */

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <string>
// #include <vector>

// #include "arrow/dataset/partition.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/filesystem/filesystem.h"
// #include "arrow/filesystem/path_forest.h"
// #include "arrow/result.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/variant.h"
// Targeting ../../arrow_dataset/InspectOptions.java


// Targeting ../../arrow_dataset/FinishOptions.java


// Targeting ../../arrow_dataset/DatasetFactory.java


// Targeting ../../arrow_dataset/UnionDatasetFactory.java


// Targeting ../../arrow_dataset/FileSystemFactoryOptions.java


// Targeting ../../arrow_dataset/FileSystemDatasetFactory.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/projector.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <vector>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/type_fwd.h"


///
///
@Namespace("arrow::dataset") public static native @ByVal Status CheckProjectable(@Const @ByRef Schema from, @Const @ByRef Schema to);
// Targeting ../../arrow_dataset/RecordBatchProjector.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/scanner.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/expression.h"
// #include "arrow/dataset/projector.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/memory_pool.h"
// #include "arrow/type_fwd.h"
// #include "arrow/util/type_fwd.h"

@Namespace("arrow::dataset") @MemberGetter public static native @Cast("const int64_t") long kDefaultBatchSize();
// Targeting ../../arrow_dataset/ScanContext.java


// Targeting ../../arrow_dataset/ScanOptions.java


// Targeting ../../arrow_dataset/ScanTask.java


// Targeting ../../arrow_dataset/InMemoryScanTask.java




///
@Namespace("arrow::dataset") public static native @ByVal ScanTaskIteratorResult ScanTaskIteratorFromRecordBatch(
    @ByVal RecordBatchVector batches,
    @SharedPtr ScanOptions options, @SharedPtr ScanContext arg2);
// Targeting ../../arrow_dataset/Scanner.java


// Targeting ../../arrow_dataset/ScannerBuilder.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_base.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <functional>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/buffer.h"
// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/partition.h"
// #include "arrow/dataset/scanner.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/filesystem/filesystem.h"
// #include "arrow/filesystem/path_forest.h"
// #include "arrow/io/file.h"
// #include "arrow/util/compression.h"
// Targeting ../../arrow_dataset/FileSource.java


// Targeting ../../arrow_dataset/FileFormat.java


// Targeting ../../arrow_dataset/FileFragment.java


// Targeting ../../arrow_dataset/FileSystemDataset.java


// Targeting ../../arrow_dataset/FileWriteOptions.java


// Targeting ../../arrow_dataset/FileWriter.java


// Targeting ../../arrow_dataset/FileSystemDatasetWriteOptions.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_csv.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/csv/options.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/status.h"
// Targeting ../../arrow_dataset/CsvFileFormat.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_ipc.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/result.h"

  // namespace ipc
// Targeting ../../arrow_dataset/IpcFileFormat.java


// Targeting ../../arrow_dataset/IpcFileWriteOptions.java


// Targeting ../../arrow_dataset/IpcFileWriter.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_parquet.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// This API is EXPERIMENTAL.

// #pragma once

// #include <memory>
// #include <string>
// #include <unordered_set>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/discovery.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/optional.h"
// Targeting ../../arrow_dataset/SchemaManifest.java


  // namespace arrow
  // namespace parquet
// Targeting ../../arrow_dataset/ParquetFileFormat.java


// Targeting ../../arrow_dataset/ParquetFileFragment.java


// Targeting ../../arrow_dataset/ParquetFileWriteOptions.java


// Targeting ../../arrow_dataset/ParquetFileWriter.java


// Targeting ../../arrow_dataset/ParquetFactoryOptions.java


// Targeting ../../arrow_dataset/ParquetDatasetFactory.java



  // namespace dataset
  // namespace arrow


}
