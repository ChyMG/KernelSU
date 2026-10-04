package org.chymg.kernelsu.data.repository

import org.chymg.kernelsu.data.model.Module
import org.chymg.kernelsu.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
