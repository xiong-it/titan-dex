/*
 * Copyright (C) Baidu Inc. All rights reserved.
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

package com.baidu.titan.dex.analyze.types;


import com.baidu.titan.dex.DexType;
import com.baidu.titan.dex.node.DexClassNode;

/**
 * @author zhangdi07@baidu.com
 * @since 2017/12/27
 */
public class UnresolvedUninitializedRefType extends UninitializedType {

    public UnresolvedUninitializedRefType(int id, DexType dexType, int allocationPc) {
        super(id, dexType, null, allocationPc);
    }

    @Override
    public boolean isUnresolvedAndUninitializedReference() {
        return true;
    }

    @Override
    public boolean isUnresolvedTypes() {
        return true;
    }

    @Override
    public String dump() {
        return "Unresolved And Uninitialized Reference:" + getDexType() +
                " Allocation PC:" + getAllocationPc();
    }
}
