/**
 * Copyright 2020 Tianshu AI Platform. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =============================================================
 */
package org.dubhe.optimize.client;

import org.dubhe.biz.base.constant.ApplicationNameConst;
import org.dubhe.biz.base.dto.ModelOptAlgorithmCreateDTO;
import org.dubhe.biz.base.vo.DataResponseBody;
import org.dubhe.biz.base.vo.ModelOptAlgorithmQureyVO;
import org.dubhe.optimize.client.fallback.AlgorithmClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description 算法管理远程服务调用类
 * @date 2021-01-18
 */
@FeignClient(value = ApplicationNameConst.SERVER_ALGORITHM, contextId = "algorithmClient", fallback = AlgorithmClientFallback.class)
public interface AlgorithmClient {

    /**
     * 模型优化上传算法
     *
     * @param modelOptAlgorithmCreateDTO 模型优化上传算法DTO
     * @return DataResponseBody<ModelOptAlgorithmQureyVO> 算法详情
     */
    @PostMapping("/algorithms/uploadAlgorithm")
    DataResponseBody<ModelOptAlgorithmQureyVO> uploadAlgorithm(@RequestBody ModelOptAlgorithmCreateDTO modelOptAlgorithmCreateDTO);

}