

# ModelsAgentsAgentPool

Class representing an SSL agent pool

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentPoolId** | **UUID** | GUID identifier of the agent pool |  [optional] |
|**name** | **String** | Name of the agent pool |  |
|**discoverAgentsCount** | **Integer** | Number of agents that can perform discovery jobs |  [optional] |
|**monitorAgentsCount** | **Integer** | Number of agents that can perform monitoring jobs |  [optional] |
|**agents** | [**List&lt;ModelsAgentsAgentPoolAgent&gt;**](ModelsAgentsAgentPoolAgent.md) | List of the agents assigned to the pool |  [optional] |



