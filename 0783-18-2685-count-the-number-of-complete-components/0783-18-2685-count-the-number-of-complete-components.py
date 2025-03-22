class Solution:
    def countCompleteComponents(self, n: int, edges: List[List[int]]) -> int:
        graph = [[] for _ in range(n)]
        component_freq = defaultdict(int)

        for vertex in range(n):
            graph[vertex].append(vertex)

        for u, v in edges:
            graph[u].append(v)
            graph[v].append(u)
        
        for vertex in range(n):
            neighbors = sorted(graph[vertex])
            key = tuple(neighbors)
            component_freq[key] += 1

        complete_count = 0
        for key, freq in component_freq.items():
            if len(key) == freq:
                complete_count += 1

        return complete_count