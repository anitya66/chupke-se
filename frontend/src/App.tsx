import { useEffect, useState } from "react";
import { apiClient } from "./lib/apiClient";
import type { ApiResponse } from "./types/api";

function App() {
  const [message, setMessage] = useState("Connecting...");

  useEffect(() => {
    const fetchHealth = async () => {
      try {
        const response =
          await apiClient.get<ApiResponse<string>>("/health");

        setMessage(response.data.data ?? "No message received");
      } catch (error) {
        console.error("Backend connection failed:", error);
        setMessage("Backend connection failed");
      }
    };

    fetchHealth();
  }, []);

  return (
    <main>
      <h1>CHUPKE SE</h1>
      <p>{message}</p>
    </main>
  );
}

export default App;