import { useEffect, useState } from "react";
import { apiClient } from "./lib/apiClient";
import type { ApiResponse } from "./types/api";

interface AppInfo {
  name: string;
  version: string;
  status: string;
}

function App() {
  const [appInfo, setAppInfo] = useState<AppInfo | null>(null);

  useEffect(() => {
    const fetchAppInfo = async () => {
      try {
        const response =
          await apiClient.get<ApiResponse<AppInfo>>("/app/info");

        setAppInfo(response.data.data);
      } catch (error) {
        console.error("Failed to load app info:", error);
      }
    };

    fetchAppInfo();
  }, []);

  return (
    <main>
      <h1>{appInfo?.name ?? "CHUPKE SE"}</h1>
      <p>Version: {appInfo?.version ?? "Loading..."}</p>
      <p>Status: {appInfo?.status ?? "Loading..."}</p>
    </main>
  );
}

export default App;