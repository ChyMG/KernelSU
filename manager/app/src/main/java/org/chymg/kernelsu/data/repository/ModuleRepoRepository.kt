package org.chymg.kernelsu.data.repository

import org.chymg.kernelsu.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
