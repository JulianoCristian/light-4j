/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
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

package com.networknt.status;

/**
 * Created by steve on 02/09/16.
 */
public class ApiException extends Exception {
    private static final long serialVersionUID = 1L;
    private Status status;

    public Status getStatus() {
        return status;
    }

    public ApiException(Status status) {
        this.status = status;
    }

    public ApiException(String code) {
        this.status = new Status(code);
    }

    public ApiException(Status status, Throwable cause) {
        super(cause);
        this.status = status;
    }
}